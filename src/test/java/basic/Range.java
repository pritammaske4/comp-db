package basic;

public enum Range {
    LOW("low"),MEDIUM("medium"),HIGH("high");
    //String smallCase;
    Range(String smallCase){
        //this.smallCase=smallCase;
        System.out.println(smallCase);
    }



    public static void main(String[] args) {
        //System.out.println("Hello "+Range.LOW.smallCase);
        Range r = Range.HIGH;
        //System.out.println(r.smallCase);

    }



}

