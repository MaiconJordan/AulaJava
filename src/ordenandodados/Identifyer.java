package ordenandodados;

import java.util.UUID;

public class Identifyer {

    private String id;

    public Identifyer(String id) {
        validate(id);
        this.id = id;
    }

    public Identifyer() {
        // Default id== constructor
        String id = UUID.randomUUID().toString();
        validate(id);
        this.id = id;
    }

    public void validate(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty");
        }
    }

    //comentario para teste de commit

    public String getId() {
        return id;
    }

    public void update(String id){
        validate(id);
        this.id = id;
    }

   
}
