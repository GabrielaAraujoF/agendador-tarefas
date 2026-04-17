package com.javanauta.agendadortarefas.business;

import com.javanauta.agendadortarefas.business.dto.TarefasDTO;
import com.javanauta.agendadortarefas.infrastructure.entity.TarefasEntity;
import com.javanauta.agendadortarefas.infrastructure.repository.TarefasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TarefaService {

    //metodo POST - salva dados da tarefa

    private TarefasRepository tarefasRepository;
    public TarefasDTO gravarTarefa(TarefasDTO dto){
        return tarefasReposiroy.save();
    }

}
