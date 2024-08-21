import random
from heapq import merge
import time

# MERGE-SORT(L: List with n elements) : Ordered list with n elements
#     IF (list L has one element)
#         RETURN L.
#     Divide the list into two halves A and B.
#     A ← MERGE-SORT(A).
#     B ← MERGE-SORT(B).
#     L ← MERGE(A, B).
#     RETURN L. 


def gera_vetor(nro_pares, nro_impares):
    res = None
    cont_par = 0
    cont_impar = 0

    if (nro_pares >= 0 or nro_impares >= 0) and (nro_pares + nro_impares > 0):
        res = [0] * (nro_pares + nro_impares)

        while cont_par < nro_pares or cont_impar < nro_impares:
            novo_num = random.randint(1, 98)

            if novo_num % 2 == 0 and cont_par < nro_pares:
                res[cont_par + cont_impar] = novo_num
                cont_par += 1
            elif novo_num % 2 == 1 and cont_impar < nro_impares:
                res[cont_par + cont_impar] = novo_num
                cont_impar += 1

    return res


contador = 0
def merge_sort(L):
    global contador
    contador += 1
    if len(L) <= 1:
        return L

    A = L[:len(L)//2]
    B = L[len(L)//2:]

    A = merge_sort(A)
    B = merge_sort(B)

    return merge(A, B)

inicio = time.time()
print(merge_sort(vetor))
fim = time.time()

print(fim - inicio)
print(contador)

def gera_vetor(nro_pares, nro_impares):
    res = None
    cont_par = 0
    cont_impar = 0

    if (nro_pares >= 0 or nro_impares >= 0) and (nro_pares + nro_impares > 0):
        res = [0] * (nro_pares + nro_impares)

        while cont_par < nro_pares or cont_impar < nro_impares:
            novo_num = random.randint(1, 98)

            if novo_num % 2 == 0 and cont_par < nro_pares:
                res[cont_par + cont_impar] = novo_num
                cont_par += 1
            elif novo_num % 2 == 1 and cont_impar < nro_impares:
                res[cont_par + cont_impar] = novo_num
                cont_impar += 1

    return res


# Exemplo de uso
nro_pares = 3
nro_impares = 2
vetor = gera_vetor(nro_pares, nro_impares)
print(vetor)
