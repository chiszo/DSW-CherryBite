package pe.edu.cibertec.cherryBite.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.cherryBite.model.dto.AlimentoDto;
import pe.edu.cibertec.cherryBite.model.dto.DtoEntity;
import pe.edu.cibertec.cherryBite.service.IAlimentoService;
import pe.edu.cibertec.cherryBite.util.DtoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping(path = "apiweb/cherry/alimento")
public class AlimentoController {

    private IAlimentoService iAlimentoService;

    @GetMapping("")
    public ResponseEntity<List<DtoEntity>> getAllAlimentos(){
        List<DtoEntity>alimentoDtoList=new ArrayList<>();
        alimentoDtoList=iAlimentoService.listarAlimentos()
                .stream()
                .map(x -> new DtoUtil().convertirADto(x,new AlimentoDto()))
                .collect(Collectors.toList());
        if(alimentoDtoList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(alimentoDtoList, HttpStatus.OK);
    }
}
