package ass_1.seta;

class SomeCLass {
    int num;
    public SomeCLass() {
        num = 0;
    }
    public SomeCLass(int num){
        this.num = num;
    }
}

class a {
    public static void main(String []args){
        SomeCLass obj1 = new SomeCLass();
        if(args.length > 0){
            int n = Integer.parseInt(args[0]);
            SomeCLass obj2 = new SomeCLass(n);
            System.out.println(obj1.num);
            System.out.println(obj2.num);
        } else {
            System.out.println("Insufficient Arguments");
        }
    }
}
