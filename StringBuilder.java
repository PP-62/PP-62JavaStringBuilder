import java.util.Stack;

class StringBuilder{

    String mainString;
    Stack<StringOperation> opList;

    StringBuilder(String str){
        this.mainString = str;
        this.opList = new Stack<StringOperation>();
    }

     String exec(){
        String temp = this.mainString;
        for(StringOperation op : opList){
            temp = op.exec(temp);
            }
            return temp;
        }

    public String undo(){
        this.opList.pop();
        return this.exec();
    }

    public String toString(){
        return this.exec();
    }
        
    public String append(String add){
        this.opList.push(new StringAppend(add));
        return this.exec();
    }
}