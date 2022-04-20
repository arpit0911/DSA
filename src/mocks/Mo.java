package mocks;

public class Mo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        revArray(arr);
    }

    private static void revArray(int[] arr) {
        int n=arr.length;
        for (int i = 0, j=n-1; i < n-1/2; i++, j--) {
            // System.out.print(i +", "+ j + " ");
            if(i==j){
                break;
            }

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
    // s f
    // 1, 2, 3 ,4,  5 
    // public static void checkLoop(Node head){
    //     Node slow= head;
    //     Node fast= head;
    //     int flag=0;

    //     while(slow!=null && fast!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //         if(slow == fast){
    //             flag=1;
    //             break;
    //         }
    //     }
    //     if(flag == 1){
    //         System.out.println("looped");
    //     }else{
    //         System.out.println("no loop");
    //     }
    // }
}
