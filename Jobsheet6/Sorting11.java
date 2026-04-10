package Jobsheet6;

public class Sorting11 {
    int [] data;
    int jumdata;
 
Sorting11 (int Data [], int jmldata) {
    jumdata=jmldata;
    data=new int[jmldata];
    for (int i = 0; i < jumdata; i++) {
        data[i]= data[i];
    }
}
        void bubbleSort(){
            int temp=0;
            for (int k = 0; k < jumdata-1; k++) {
                for (int j = 1; j < jumdata -1; j++) {
                    if (data[j-1]>data[j]) {
                        temp=data[j];
                        data[j]=data[j-1];
                        data[j-1]=temp;
                        }
                    }
                }
            }
        
    void Tampil(){
    for (int i = 0; i < jumdata; i++) {
        System.out.print(data[i]+" ");
    }
    System.out.println();
    }
void SelectionSort(){
    for (int i = 0; i < jumdata-1; i++) {
        int Min=i;
        for (int j = i+1; j < jumdata; j++) {
            if (data[j]<data[Min]) {
                Min=j;
            }
        }
        int Temp=data[i];
        data[i]=data[Min];
        data[Min]=Temp;
    } 
}
void InsertionSort(){
    for (int i = 1; i < data.length; i++) {
        int Temp=data[i];
        int j=i-1;
        while (j>=0 && data[j]>Temp) {
            data[j+1]=data[j];
            j++;
        }
        data[j+1]=Temp;
    }
}
}
