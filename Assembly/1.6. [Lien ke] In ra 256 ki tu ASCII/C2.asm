.Model Small
.Stack 100h
.Data
.Code
Start:
    mov cx, 256
    mov dl, 0    
    
    lp:
        mov ah, 2   
        int 21h
        inc dl
        
    loop lp
    mov ah, 4Ch
    int 21h

End