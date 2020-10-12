.Model Small

.Stack 100h 

.Data
    k db 1 
.Code
 Start:
    Mov AX, @Data
    Mov DS, AX 

    Mov AH, 2  
           
    l1:  
        cmp k, 255
        je l2
             
        Mov DL, k
        int 21h           
        
       
        
        Mov DL, 32
        int 21h
        
        add k, 1
       
        
        Cmp k, 10
        je do      
        loop l1       
    do:
        add k, 1      
        jmp l1
    l2:         
    Mov AH, 4ch
    Int 21h