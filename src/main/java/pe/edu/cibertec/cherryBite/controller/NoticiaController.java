package pe.edu.cibertec.cherryBite.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.cherryBite.model.dto.AlimentoDto;
import pe.edu.cibertec.cherryBite.model.dto.DtoEntity;
import pe.edu.cibertec.cherryBite.model.dto.NoticiaDto;
import pe.edu.cibertec.cherryBite.service.INoticiaService;
import pe.edu.cibertec.cherryBite.util.DtoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping(path = "apiweb/cherry/noticia")
public class NoticiaController {
    INoticiaService iNoticiaService;

    @GetMapping("")
    public ResponseEntity<List<DtoEntity>> getAllNoticias(){
        List<DtoEntity>noticiaDtoList=new ArrayList<>();
        noticiaDtoList=iNoticiaService.listarNoticias()
                .stream()
                .map(x -> new DtoUtil().convertirADto(x,new NoticiaDto()))
                .collect(Collectors.toList());
        if(noticiaDtoList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(noticiaDtoList, HttpStatus.OK);
    }
}
