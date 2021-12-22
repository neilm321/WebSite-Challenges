class MinStack{
  
  Stack<Integer> s = new Stack;
  int min = Integer.MAX_VALUE;
  public MinStack(){
    
  }
  
  public void push(int x){
    if(x<=min)
    {
      s.push(min);
      
      
    }
    s.push(x);
  }
  
  public void pop(){
    if(s.pop() == min)min = s.pop();
    
  }
  
  public int top(){
    
    return s.peek();
    return min;
  }
}
