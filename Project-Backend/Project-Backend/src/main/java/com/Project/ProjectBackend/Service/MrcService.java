package com.Project.ProjectBackend.Service;

import com.Project.ProjectBackend.DTO.MrcDTO;
import com.Project.ProjectBackend.DTO.MrcSaveDTO;
import com.Project.ProjectBackend.DTO.MrcUpdateDTO;
import com.Project.ProjectBackend.MrcRepo.MrcRepo;
import com.Project.ProjectBackend.entity.Mrc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class MrcService implements MrcServiceIMPL {

    @Autowired
    private MrcRepo mrcRepo;

    @Override
    public String addMrc(MrcSaveDTO mrcSaveDTO) {
        Mrc mrc = new Mrc(
                mrcSaveDTO.getMrcnumber(),
                mrcSaveDTO.getMrcdrivername(),
                mrcSaveDTO.getMrctime(),
                mrcSaveDTO.getMrcdate(),
                mrcSaveDTO.getMrcplace(),
                mrcSaveDTO.getMrcloadone(),
                mrcSaveDTO.getMrcloadtwo(),
                mrcSaveDTO.getMrcstatus()

        );
        mrcRepo.save(mrc);
        return mrc.getMrcdrivername();
    }

    @Override
    public List<MrcDTO>getAllMrc() {
        List<Mrc> getMrc = mrcRepo.findAll();
        List<MrcDTO> mrcDTOList = new ArrayList<>();
        for (Mrc a:getMrc) {
            MrcDTO mrcDTO =  new MrcDTO(
                    a.getMrcid(),
                    a.getMrcnumber(),
                    a.getMrcdrivername(),
                    a.getMrctime(),
                    a.getMrcdate(),
                    a.getMrcplace(),
                    a.getMrcloadone(),
                    a.getMrcloadtwo(),
                    a.getMrcstatus()
            );
        mrcDTOList.add(mrcDTO);
        }

        return mrcDTOList;

    }

    @Override
    public String updateMrc(MrcUpdateDTO mrcUpdateDTO) {
        if(mrcRepo.existsById(mrcUpdateDTO.getMrcid())) {
            Mrc mrc = mrcRepo.getById(mrcUpdateDTO.getMrcid());
            mrc.setMrcnumber(mrcUpdateDTO.getMrcnumber());
            mrc.setMrcdrivername(mrcUpdateDTO.getMrcdrivername());
            mrc.setMrctime(mrcUpdateDTO.getMrctime());
            mrc.setMrcdate(mrcUpdateDTO.getMrcdate());
            mrc.setMrcplace(mrcUpdateDTO.getMrcplace());
            mrc.setMrcloadone(mrcUpdateDTO.getMrcloadone());
            mrc.setMrcloadtwo(mrcUpdateDTO.getMrcloadtwo());
            mrc.setMrcstatus(mrcUpdateDTO.getMrcstatus());
            mrcRepo.save(mrc);
        }
            else
            {
             System.out.println("id not found...");
        }
            return null;
        }

    @Override
    public boolean deleteMrc(int id) {
        if(mrcRepo.existsById(id))
        {
            mrcRepo.deleteById(id);
        }
        else {
            System.out.println("id not found...");
        }
        return true;
    }
}


