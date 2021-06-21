public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
        //t.hour = 13;    //private이기때문에 접근 불가능
        t.setHour(t.getHour() + 1);     //현재 시간보다 1 시간 후로 변경한다.
        System.out.println(t);      //toString을 호출하는 것과 같다.
    }
}
