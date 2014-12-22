// Package ex1 provides solutions for ex1
package ex1

import "testing"

func TestAdd(t *testing.T) {
	if (11124 + 12312) != add(11124, 12312) {
		t.Fail()
	}
}
