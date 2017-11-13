package br.com.studiotrek;

public interface Pool<T> {
	T acquire();
	void release(T t);
}
