public class Triangle {
    public static boolean isRightAngle(int[] arr, String desc) {
		boolean isRightAngle = false;
		int allAngle = 90;
		double angCount = 0;
		double[] add = new double[arr.length+1];
		    if(arr.length>3) return isRightAngle;
		    if(desc.equals("angle")){ 
				//Error if arr = {30, 60, 90} it should be false but it return true.
				//Error if arr no information in array. should return true.
		        for(int i=0;i<arr.length;i++){
		            angCount += arr[i];
		        }
		        if(allAngle+angCount == 180) return isRightAngle = true;
		    }
		    if(desc.equals("side")){
		        if (arr.length > 3){
                    return isRightAngle;
		        } else if (arr.length == 3) {
                    if ((Math.pow(arr[0], 2) == Math.pow(arr[1], 2) + Math.pow(arr[2], 2)) ||
                        (Math.pow(arr[1], 2) == Math.pow(arr[0], 2) + Math.pow(arr[2], 2)) ||
                        (Math.pow(arr[2], 2) == Math.pow(arr[1], 2) + Math.pow(arr[0], 2))) {
                            return isRightAngle = true;
                    }
		        }
		        if(arr.length <= 2){
						add[2] = (Math.pow(arr[0], 2) + Math.pow(arr[1], 2));
						Math.sqrt(add[2]);
						return isRightAngle = true;
					}
                }
            return isRightAngle;
		}
	public static void main(String[] args) {
		Triangle t = new Triangle();
		int[] arr0 = {30, 60};
		int[] arr1 = {20, 20, 20, 20};
		int[] arr2 = {4, 5, 3};
		int[] arr3 = {4, 5};
		System.out.println(t.isRightAngle(arr0, "angle"));
		System.out.println(t.isRightAngle(arr1, "angle"));
		System.out.println(t.isRightAngle(arr2, "side"));
		System.out.println(t.isRightAngle(arr3, "side"));
	}
}