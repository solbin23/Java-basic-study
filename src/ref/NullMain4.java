package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointException -> data의 값이 null 이므로 null에 .을 찍게되고 참조할 곳이 없으므로 예외 발생
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
