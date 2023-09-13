import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {
  MrcArray : any[] = [];
  isResultLoaded = false;
  isUpdateFromActive = false;

  mrcnumber : string = "";
  mrcdrivername : string = "";
  mrctime : string = "";
  mrcdate : string = "";
  mrcplace : string = "";
  mrcloadone : string = "";
  mrcloadtwo : string = "";
  mrcstatus : string = "";

  currentMrcID = "";

  constructor(private http: HttpClient )
  {
    this.getAllMrc();
  }

  getAllMrc()
  {
    
    this.http.get("http://localhost:8080/api/v1/customer/getAllMrc")
  
    .subscribe((resultData: any)=>
    {
        this.isResultLoaded = true;
        console.log(resultData);
        this.MrcArray = resultData;
    });
  }
 
  register()
  {
  
    let bodyData = {
      "mrcnumber" : this.mrcnumber,
      "mrcdrivername" : this.mrcdrivername,
      "mrctime" : this.mrctime,
      "mrcdate" : this.mrcdate,
      "mrcplace" : this.mrcplace,
      "mrcloadone" : this.mrcloadone,
      "mrcloadtwo" : this.mrcloadtwo,
      "mrcstatus" : this.mrcstatus
    };
 
    this.http.post("http://localhost:8080/api/v1/mrc/save",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert(" Registered Successfully");
        this.getAllMrc();
        this.mrcnumber = '';
        this.mrcdrivername = '';
        this.mrctime = '';
        this.mrcdate = '';
        this.mrcplace = '';
        this.mrcloadone = '';
        this.mrcloadtwo = '';
        this.mrcstatus = '';
   
    });
  }
  setUpdate(data: any)
  {
    this.mrcnumber = data.mrcnumber;
   this.mrcdrivername = data.mrcdrivername;
   this.mrctime = data.mrctime;
   this.mrcdate = data.mrcdate;
   this.mrcplace = data.mrcrplace;
   this.mrcloadone = data.mrcloadone;
   this.mrcloadtwo = data.mrcloadtwo;
   this.mrcstatus = data.mrcstatus;
  }
 
  UpdateRecords()
  {
    let bodyData = {
      "mrcid" : this.currentMrcID,
      "mrcnumber" : this.mrcnumber,
      "mrcdrivername" : this.mrcdrivername,
      "mrctime" : this.mrctime,
      "mrcdate" : this.mrcdate,
      "mrcplace" : this.mrcplace,
      "mrcloadone" : this.mrcloadone,
      "mrcloadtwo" : this.mrcloadtwo,
      "mrcstatus" : this.mrcstatus
    };
    
    this.http.put("http://localhost:8080/api/v1/mrc/update",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert(" Registered Updated...")
        this.getAllMrc();
        this.mrcnumber = '';
        this.mrcdrivername = '';
        this.mrctime = '';
        this.mrcdate = '';
        this.mrcplace = '';
        this.mrcloadone = '';
        this.mrcloadtwo = '';
        this.mrcstatus = '';
    });
  }
 
  save()
  {
    if(this.currentMrcID == '')
    {
        this.register();
    }
      else
      {
       this.UpdateRecords();
      }      
 
  }
 
  setDelete(data: any)
  {
    
    
    this.http.delete("http://localhost:8080/api/v1/mrc/deletemrc"+ "/"+ data.mrcid,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Data Deleted")
        this.getAllMrc();
        this.mrcnumber = '';
        this.mrcdrivername = '';
        this.mrctime = '';
        this.mrcdate = '';
        this.mrcplace = '';
        this.mrcloadone = '';
        this.mrcloadtwo = '';
        this.mrcstatus = '';
  
    });
 
  }
 }

