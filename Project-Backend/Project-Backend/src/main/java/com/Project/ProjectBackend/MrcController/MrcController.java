package com.Project.ProjectBackend.MrcController;

import com.Project.ProjectBackend.DTO.MrcDTO;
import com.Project.ProjectBackend.DTO.MrcSaveDTO;
import com.Project.ProjectBackend.DTO.MrcUpdateDTO;
import com.Project.ProjectBackend.Service.MrcServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/mrc")

public class MrcController {

    @Autowired
    private MrcServiceIMPL mrcService;

    @PostMapping(path = "/save")
    public String saveMrc(@RequestBody MrcSaveDTO mrcSaveDTO)
    {
        String id = mrcService.addMrc(mrcSaveDTO);
        return id;
    }

    @GetMapping (path = "/getAllMrc")
    public List<MrcDTO> getAllMrc()
    {
         List<MrcDTO>allMrc = mrcService.getAllMrc();
         return allMrc;
    }

    @PutMapping (path = "/update")
    public String updateMrc(@RequestBody MrcUpdateDTO mrcUpdateDTO)
    {
        String id = mrcService.updateMrc(mrcUpdateDTO);
        return id;
    }
    @DeleteMapping (path = "/deletemrc/{id}")
    public String deleteMrc(@PathVariable(value = "id") int id)
    {
        boolean deletemrc = mrcService.deleteMrc(id);
        return "deleted";
    }


}
