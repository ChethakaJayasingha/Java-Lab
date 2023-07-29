package com.mycompany.question2;
public class Question2 {

    public static void main(String[] args) {
        int[] numbers={1,24,34,56,41,98,62,43};
        try{
            numbers[3]=89;
            System.out.println("Result is "+numbers[3]);
            int ans=numbers[2]/0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array Index Out Of Bounds Exception");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            for(int i=0;i< numbers.length;i++){
                System.out.println(numbers[i]);
            }
        }
    }
}

