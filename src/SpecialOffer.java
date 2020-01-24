public class SpecialOffer {
    Product product;
    String description;
    String startOffer;
    String endOffer;
    double discount;

    SpecialOffer(Product prod, String des, String start, String end, double dis){
        product = prod;
        description = des;
        startOffer = start;
        endOffer = end;
        discount = dis;
    }

}
