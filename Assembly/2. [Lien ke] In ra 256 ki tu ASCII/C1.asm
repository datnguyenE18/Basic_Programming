.Model Small
.Stack 100h
.Data
.Code
Start:
    mov cx, 256
    mov al, 0    
    
    lp:
        mov ah, 2
        mov dl, al      
        int 21h
        inc al
        
    loop lp
    mov ah, 4Ch
    int 21h

End