import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ReportComponent } from './report/report.component';
import { FormComponent } from './form/form.component';
 
 

const routes: Routes = [
  {path: '' ,component:HomeComponent},
  {path: 'form' ,component:FormComponent},
  {path: 'report' ,component:ReportComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
