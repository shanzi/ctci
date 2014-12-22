// Package ex1 provides solution for ex18.1
package ex1

func add(a, b int) int {
	res := a ^ b
	carry := (a & b) << 1
	if carry > 0 {
		return add(res, carry)
	}
	return res
}
