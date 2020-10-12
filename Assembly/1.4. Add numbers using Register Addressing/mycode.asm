.model

.stack 100h

.data
    ;data here

.code
 main PROC
  
    mov AX,1234
    mov BX,5678
    add AX,BX
  
    MOV BX, 1256h
    MOV CX, 3478h
    ADD BX,CX
  
    MOV CX, 1100b
    MOV DX, 1010b
    ADD CX,DX
  
    int 21h
    mov AX,04ch
    int 21h
  
main ENDP
end main