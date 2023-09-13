package com.Project.ProjectBackend.Service;

import com.Project.ProjectBackend.DTO.MrcDTO;
import com.Project.ProjectBackend.DTO.MrcSaveDTO;
import com.Project.ProjectBackend.DTO.MrcUpdateDTO;

import java.util.List;

public interface MrcServiceIMPL {

    String addMrc(MrcSaveDTO mrcSaveDTO);

    List<MrcDTO> getAllMrc();

    String updateMrc(MrcUpdateDTO mrcUpdateDTO);

    boolean deleteMrc(int id);
}
