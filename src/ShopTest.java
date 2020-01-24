public class ShopTest {
    public static void main(String[] args) {
        Category sweets = new Category("Słodycze", "Dla każdego coś dobrego");
        Category bread = new Category("Pieczywo", "Z czegoś trzeba zrobić kanapki");
        Product candys = new Product("Cukierki", 4, "Cukierki pudrowe", sweets);
        Product rolls = new Product("Bułki", 1, "Świeże bułeczki", bread);
        Product cookies = new Product("Ciasteczka", 5, "Przekąska do kawy", sweets);
        Product coffee = new Product("Kawa rozpuszczalna", 8, "DLa pobudzenia");
        SpecialOffer offer1 = new SpecialOffer(cookies, "Promocja na ciastka", "1 Luty", "1 Marzec", 0.2);


    }
}
