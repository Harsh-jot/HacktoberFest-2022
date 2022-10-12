R = int(input("Enter the number of rows:"))
C = int(input("Enter the number of columns:"))
x = []
print("Enter the entries rowwise:")
for i in range(R): 
    a =[]
    for j in range(C): 
         a.append(int(input()))
    x.append(a)
for i in range(R):
    for j in range(C):
        print(x[i][j], end = " ")
    print()
