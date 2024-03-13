class RandomizedSet {

HashMap<Integer,Integer> randomMap ;
	ArrayList<Integer> randomList;
	
	Random random = new Random();
	
	public RandomizedSet() {
		randomMap = new HashMap<>();
		randomList =  new ArrayList<>();
        
    }
    
    public boolean insert(int val) {
  
    	if(randomMap.containsKey(val)) {
    		return false;
    	}else {
    		randomList.add(val);
    		randomMap.put(val, randomList.size()-1);
    		return true;
    	}
    }
    
    public boolean remove(int val) {
		
    	if(randomMap.containsKey(val)) {
    		int index = randomMap.get(val);
    		randomList.set(index, randomList.get(randomList.size()-1));
    		randomMap.put(randomList.get(index), index);
            randomList.remove(randomList.size()-1);
            randomMap.remove(val);
    		return true;
    	}else {
    		return false;
    	}
        
    }
    
    public int getRandom() {
    	return randomList.get( random.nextInt(randomList.size()) );
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */