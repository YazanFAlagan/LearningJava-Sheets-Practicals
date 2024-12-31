public class Bus extends Vehicle {
    double j;
    Bus(double j) {
        super((int) j);// كان لازم نعمل سوبر عشان نستدعي الكونستركتور بتاع vehicle , وحولت من دبل ل انت عشان مينفعش اني ادخل رقم عشري مرة واحدة فا ب التالي هيتحول من عشري لصحيح
        this.j = j;
    }
}