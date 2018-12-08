1. Similarly, in pop() , we begin by deleting the item, then we halve the array size if it is
   too large. If you think a bit about the situation, you will see that the appropriate test
   is whether *the stack size is less than one-fourth the array size*. After the array is halved,
   it will be about half full and can accommodate a substantial number of push() and
   pop() operations before having to change the size of the array again.
   
   
   
   ```java
   public String pop()
   { // 从栈顶删除元素.
   String item = a[--N];
   a[N] = null; // 避免游离.
   if (N > 0 && N == a.length/4) resize(a.length/2);
   return item;
   }

   ```