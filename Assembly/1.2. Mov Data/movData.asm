.Model small

.Data
    num1 dw 1
    num2 dw ?

.Code
 Main PROC
  
    mov AX, data
    mov DS, AX
  
    ;reg, mem:
    mov AX, num1
  
    ;mem, imm
    mov num2, 3
  
    ;reg, imm 
    mov BX, 2
  
    ;reg, reg
    mov CX, BX
  
    ;mem, reg
    mov num1, CX

    mov AX, 04ch
    int 21h
  

ENDP
END MAIN