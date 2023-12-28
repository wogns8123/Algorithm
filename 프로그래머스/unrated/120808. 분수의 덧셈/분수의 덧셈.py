import math
def solution(numer1, denom1, numer2, denom2):
    up = numer1 * denom2 + numer2 * denom1
    down = denom1 * denom2
    minimum = math.gcd(up, down)
    
    return [up // minimum, down // minimum]