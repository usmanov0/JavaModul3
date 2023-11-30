package Enums;

import java.security.SecurityPermission;

public enum Role {
    ADMIN(new Permissions[]{Permissions.ADD,Permissions.DELETE,Permissions.READ,Permissions.UPDATE}),
    MODERATOR(new Permissions[]{Permissions.UPDATE,Permissions.DELETE,Permissions.READ}),
    USER(new Permissions[]{Permissions.READ}),
    COPYWRITER(new Permissions[]{Permissions.READ,Permissions.ADD});

    private Permissions[] permimssion;
    enum Permissions{
        UPDATE,
        DELETE,
        READ,
        ADD;
    }

    Role(Permissions[] permimssion) {
        this.permimssion = permimssion;
    }
    public boolean hasPermission(Permissions permisson){
        for(Permissions s: permimssion){
            if(permisson.equals(s)) return true;
        }
        return false;
    }

}
