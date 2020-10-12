.Model

.Stack 100h

.Data
    ;data here

.Code

Main PROC
    mov AX, 1234
    add AX, 5678
    
    mov BX, 1234h
    add BX, 5678h
    
    
    mov CX, 1100110011001100b
    add CX, 1010101010101010b 
    
    int 21h
    mov AX, 4Ch
    int 21h 