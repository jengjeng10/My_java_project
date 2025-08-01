package ch04_class;

public class RPGgame03 {

    private String name ;

    void setName (String name){
        this.name = name ;
    }

    public String getName (){
        return name;
    }

    private String job ;

    public RPGgame03(String name, String job, int Str, int Dex, int Con){
        this.name = name;
        this.job = job;
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;

    }

    public RPGgame03(String name,int Str, int Dex, int Con){
        this.name = name;
        this.job = "도적";
        this.Str = Str;
        this.Dex = Dex;
        this.Con = Con;
    }
    public RPGgame03(String name, double Str, double Dex , double Con){

        this.name = name;
        this.job = "성기사";
        this.Str = (int) Str;
        this.Dex = (int) Dex;
        this.Con = (int) Con;

    }
    public RPGgame03(String name, String job , double Str , double Dex ,  double con){
        this.name = name;
        this.job = job;
        this.Str = (int)Str;
        this.Dex = (int)Dex;
        this.Con = (int)Con;


    }

    void setJob (String job){
        this.job = job ;
    }

    public String getJob (){
        return job ;
    }

    private int Str , Dex , Con;

    void setStr(int Str){
        this.Str = Str ;
    }

    void setDex(int Dex){
        this.Dex = Dex ;
    }

    void setCon(int Con){
        this.Con = Con ;
    }

    public int getStr(){
    return Str;
    }

    public int getDex(){
    return Dex;
    }

    public int getCon(){
    return Con;
    }


    public void display(){
        System.out.println("캐릭터의 이름 : "+name);
        System.out.println("캐릭터의 직업 : "+job);
        System.out.print("STR : "+Str+" ");
        System.out.print("DEX : "+Dex+" ");
        System.out.println("CON : "+Con+" ");
        System.out.println();
    }



}
