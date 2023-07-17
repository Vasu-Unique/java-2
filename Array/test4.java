class Solution {  
    // Stack representation
    class Stack{
        int size;
        // initializing stack size, top 
        int top;
        int array[]=;
    }
     
    // Function to create a stack of a given size
    Stack Create_Stack(int size)
    {
        Stack stack = new Stack();
        stack.size = size;
        // initialise top to -1
        stack.top = -1;
        //dynamically allocating the memory for stack
        .array[] = new int[size];
        return stack;
    }
     
    // Function to check whether the stack is full
        // returns true if the stack is full
    Boolean Is_Full(Stack stack){
        // stack is full when top == size-1
        return (stack.top == stack.size - 1);
    }
     
    // Function to check whether stack is empty
        // returns truethe  if the stack is empty
    Boolean Is_Empty(Stack stack){
        // Stack is considered to be empty when top==-1
        return (stack.top == -1);
    }
     
    // Function to push an item to stack. It inincreasesses top by 1
    void Push(Stack stack, int element){
        // if stack is full you cannot add the item to the stack
        if (Is_Full(stack))
            return; 
        stack.array[++stack.top] = element;
    }
     
    // Function to remove an item from the stack. It decreases the top by 1
    int Pop(Stack stack){
        // if the stack is empty you cannot remove any 
        if (Is_Empty(stack))
            // if empty return the INT Min value
            return Integer.MIN_VALUE;
        return stack.array[stack.top--];
    }
     
    // Function to move the disks between the rods 
        // this function does intermediatory steps required for moving all disks to the destination rod
    void MoveDisks(Stack src, Stack dest, char s, char d){
        int pole1 = Pop(src);
        int pole2 = Pop(dest);
     
        // When pole 1 is empty
        if (pole1 == Integer.MIN_VALUE){
            Push(src, pole2);
            //  to print the movement which just happend
            printdisk(d, s, pole2);
        }
         
        // When pole2 pole is empty
        else if (pole2 == Integer.MIN_VALUE){
            Push(dest, pole1);
            //  to print the movement which just happend
            printdisk(s, d, pole1);
        }
         
        // When top disk of pole1 > top disk of pole2
        else if (pole1 > pole2){
            Push(src, pole1);
            Push(src, pole2);
            //  to print the movement which just happend
            printdisk(d, s, pole2);
        }
        // When top disk of pole1 < top disk of pole2
        else{
            Push(dest, pole2);
            Push(dest, pole1);
            //  to print the movement which just happend
            printdisk(s, d, pole1);
        }
    }
     
    // Function to print the movement of disks
    void printdisk(char source_rod, char dest_rod, int disk){
        System. out.println("Move the disk " + disk + " from " + source_rod + " -> " + dest_rod);
    }
     
    // Function to implement TOH puzzle in the iterative approach
    void TohIterative(int N, Stack src, Stack aux, Stack dest){
        int I, total_moves;
        char s = 'A', d = 'C', a = 'B';
      
        // If the number of disks is even, then we need to interchange the destination pole with the auxiliary pole
        if (N% 2 == 0){
            char temp = d;
            d = a;
            a  = temp;
        }
        // for getting the total number of moves
        total_moves = (int)(Math.pow(2, N) - 1);
      
        // We know that larger disks should be inserted first  
        for(i = N; i >= 1; i--)
            Push(src, i);
      
        for(i = 1; i <= total_moves; i++)
        {
            if (i % 3 == 1)
              MoveDisks(src, dest, s, d);
      
            else if (i % 3 == 2)
              MoveDisks(src, aux, s, a);
      
            else if (i % 3 == 0)
              MoveDisks(aux, dest, a, d);
        }
    }
    // Driver code
    public static void main(String[] args)
    {
        // Total number of disks in the source peg
        int N = 4;
         
        Solution obj1 = new Solution();
        Stack source_rod, dest_rod, aux_rod;
         
        // Create three stacks of size N to hold the disks
        source_rod = obj1.Create_Stack(N);
        dest_rod = obj1.Create_Stack(N);
        aux_rod = obj1.Create_Stack(N);
         
        // Calling the Tower of Hanoi iterative approach function
        obj1.TohIterative(N, source_rod, aux_rod, dest_rod);
    }
    }
    
    