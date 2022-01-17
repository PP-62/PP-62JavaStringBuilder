public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("MainString_");
        sb.append("FirstAdd_");
        sb.append("SecondWillBePoped_");
        sb.undo();
        sb.append("ThirdAfterPoped");
        
        System.out.println(sb.exec());
    }
}
