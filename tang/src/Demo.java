public class Demo {
    public static void main(String[] args) {

        for (int i = 0;i<2;i++){        //i代表甲，0为真，1为假
            for (int j = 0;j<2;j++){    //j代表乙，0为真，1为假
                for (int k=0;k<2;k++){  //k代表丙，0为真，1为假
                    //如果甲为真，则乙为假
                    if (i==0){
                        //如果乙为假，则丙为真
                        if(j==1){
                            //如果丙为真，甲为假
                            if (k==0){
                                if (i==1){
                                    System.out.println("甲为真");
                                    System.out.println("乙为假");
                                    System.out.println("丙为真");
                                }
                            }
                        }
                    }else{
                        //甲为假则乙为真
                        if (j==0){
                            //乙为真，丙为假
                            if (k==1){
                                System.out.println("甲为假");
                                System.out.println("乙为真");
                                System.out.println("丙为假");
                            }
                        }
                    }
                }
            }
        }
    }
}
