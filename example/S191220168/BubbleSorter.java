package S191220168;

public class BubbleSorter implements Sorter {

    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    swap(i, i + 1);
                    sorted = false;
                }
            }
        }
    }
    
    @Override
    public void sort2() {
        for(int i = 0; i < a.length - 1; i++){
            int minIndex = i;      
            for(int j = i + 1; j < a.length; j++){             
                if(a[j] < a[minIndex]){                
                    minIndex = j;              
                }           
            }  
            swap(minIndex, i);         
        }   
    }
    @Override
    public String getPlan() {
        return this.plan;
    }

}
