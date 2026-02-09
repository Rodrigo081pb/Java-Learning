package AULA15.DEBUG.MODELS;

import AULA15.DEBUG.DAO.UsuarioDIO;
import AULA15.DEBUG.exception.UserNotFoundException;
import AULA7.ARRAYS.SETS.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UserModel {

    private long nextId = 1;


    private final List<UsuarioDIO> models = new ArrayList<>();

    public UsuarioDIO save(final UsuarioDIO model){
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UsuarioDIO update(final UsuarioDIO model){
        var toUpdate = findById(model.getId());
        toUpdate.setNome(model.getNome());
        toUpdate.setEmail(model.getEmail());
        toUpdate.setAniversario(model.getAniversario());
        return toUpdate;
    }

    public UsuarioDIO delete(final long id){
        var toDelete = findById(id);
        models.remove(toDelete);
        return toDelete;
    }

    public UsuarioDIO findById(final long id){
        var message = String.format("Não existe usuário com o id: %s", id);
        return models.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(message));
    }

    public List<UsuarioDIO> findAll(){
        return models;
    }

}
