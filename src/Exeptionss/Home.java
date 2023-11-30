package Exeptionss;

public class Home {
    int qavat;
    String rangi;
    int roomcount;
    String PersonName;
    public Home(int qavat, String rangi, int roomcount, String PersonName){
        this.qavat = qavat;
        this.rangi = rangi;
        this.roomcount = roomcount;
        this.PersonName = PersonName;
    }

    public int getQavat() {
        return qavat;
    }

    public void setQavat(int qavat) {
        if(qavat < 0 ) throw new QavatCantBeLessThanZeroException();
        this.qavat = qavat;
    }

    public String getRangi() {
        return rangi;
    }

    public void setRangi(String rangi) {
        if (rangi == null || rangi.isEmpty()) throw new RangCantBeBlankException();
        this.rangi = rangi;
    }

    public int getRoomcount() {
        return roomcount;
    }

    public void setRoomcount(int roomcount) {
        if(roomcount < 10) throw new RoomCountCantBeLessThanTenException();
        this.roomcount = roomcount;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String personName) {
        if(PersonName == null || PersonName.isEmpty()) throw new PersonNameCantBeBlankException();
        PersonName = personName;
    }
}
class QavatCantBeLessThanZeroException extends RuntimeException{
    public QavatCantBeLessThanZeroException(){
    }
}
class RangCantBeBlankException extends RuntimeException{
    public RangCantBeBlankException(){
    }
}
class RoomCountCantBeLessThanTenException extends RuntimeException{
    public RoomCountCantBeLessThanTenException(){
    }
}
class PersonNameCantBeBlankException extends RuntimeException{
    public PersonNameCantBeBlankException(){
    }
}
