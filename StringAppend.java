public class StringAppend extends StringOperation{

    String add;

    StringAppend(String add){
        this.add = add;
    }
    @Override
    String exec(String str){
        return str+this.add;
    }
}
