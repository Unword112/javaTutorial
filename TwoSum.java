public class TwoSum {
    public Boolean sumsToTarget(Integer[] arr, Integer target) {
        boolean sumsToTarget = false;
	    int sumArr = 0;
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr.length;j++){
		        sumArr = arr[i] + arr[j];
		        if(sumArr==target){
                  sumsToTarget = true;
                }
		    }
		}
	return sumsToTarget;
    }
}
