public class Num {
    int i = 5;
    void somar(int j){
        i += j;
    }

    Num somar2(int j){
        i += j;
        return this;
    }
}
