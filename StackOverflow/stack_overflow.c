int recursive (int n)
{
   if (n <= 0) {
      return 0;
   }
   else {
      return 1 + recursive(n-1);
   }
}

int main (void) {

   recursive(1000);
   recursive(1000000);
}
