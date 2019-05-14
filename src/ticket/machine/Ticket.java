package ticket.machine;

class Ticket {
         int id;
         String kind;
         double price;

     Ticket(int id, String kind, double price){
        this.id = id;
        this.kind = kind;
        this.price = price;
        //System.out.println(); sprawiało, że po uruchomieniu programu pojawiały się cztery entery
    }

//     int getId() {
//        return id;
//    }
//
//     String getKind() {
//        return kind;
//    }
//
//    double getPrice() {
//        return price;
//    }
}
