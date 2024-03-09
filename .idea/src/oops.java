package cham_prac;

public class oops {

        public static void main(String[] args) {
            int[] arr = {3, 1, 6, 4,2};


            Sort sort = new SortImpl();
            sort.sort(arr, sort.getASCENDING_ORDER());

            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }



    interface Sort {
        // default sort order e.i. ascending
        public void sort(int[] arr);
        // give order = 0 for ascending, order = 1 for descending
        public void sort(int[] arr, int order);

        public int getASCENDING_ORDER();
        public int getDESCENDING_ORDER();
    }


    class SortImpl implements Sort {

        private int ASCENDING_ORDER = 0;

        private int DESCENDING_ORDER = 1;

        @Override
        public void sort(int[] arr) {
            sort(arr, ASCENDING_ORDER);
        }

        @Override
        public void sort(int[] arr, int order) {

            if(order == ASCENDING_ORDER) {
                for(int i = 0; i < arr.length - 1; i++) {
                    int min = i;
                    for(int j = i + 1; j < arr.length; j++) {
                        if(arr[min] > arr[j]) {
                            min = j;
                        }
                    }
                    if(min != i) {
                        int t = arr[min];
                        arr[min] = arr[i];
                        arr[i] = t;
                    }
                }
            } else if( order == DESCENDING_ORDER){
                for(int i = 0; i < arr.length - 1; i++) {
                    int max = i;
                    for(int j = i + 1; j < arr.length; j++) {
                        if(arr[max] < arr[j]) {
                            max = j;
                        }
                    }
                    if(max != i) {
                        int t = arr[max];
                        arr[max] = arr[i];
                        arr[i] = t;
                    }
                }
            }

        }

        public int getASCENDING_ORDER() {
            return ASCENDING_ORDER;
        }

        public int getDESCENDING_ORDER() {
            return DESCENDING_ORDER;
        }
    }

