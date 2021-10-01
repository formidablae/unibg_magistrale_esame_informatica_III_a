# 1 "hello.cyc"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "hello.cyc"
# 1 "/usr/local/lib/cyclone/cyc-lib/i686-pc-cygwin/include/stdio.h" 1
__noinference__{




typedef long long _off64_t;



typedef _off64_t _fpos64_t;



typedef unsigned int size_t;



typedef _off64_t off_t;



typedef _fpos64_t fpos_t;
# 84 "/usr/local/lib/cyclone/cyc-lib/i686-pc-cygwin/include/stdio.h"
  extern struct __cycFILE;



  typedef struct __cycFILE FILE;

  extern FILE @stdout;
  extern FILE @stdin;
  extern FILE @stderr;

  namespace Cstdio {
    extern "C" struct __abstractFILE;
  }


  extern FILE *`H fromCfile(struct Cstdio::__abstractFILE *`H cf);



  extern datatype PrintArg<`r::E> {
    String_pa(const char ? @nozeroterm`r);
    Int_pa(unsigned long);
    Double_pa(double);
    LongDouble_pa(long double);
    ShortPtr_pa(short @`r);
    IntPtr_pa(unsigned long @`r);
  };



  typedef datatype PrintArg<`r> @`r parg_t<`r>;




  extern char ?aprintf(const char ?, ... inject parg_t)
    __attribute__((format(printf,1,2)))
    ;

  extern void clearerr(FILE @);

  extern int fclose(FILE @);


  extern FILE *fdopen(int, const char *);

  extern int feof(FILE @);

  extern int ferror(FILE @);

  extern int fflush(FILE *);

  extern int fgetc(FILE @);

  extern int fgetpos(FILE @, fpos_t @);

  extern char ? @nozeroterm`r fgets(char ? @nozeroterm`r, int, FILE @);

  extern int fileno(FILE @);





  extern FILE *fopen(const char @, const char @);

  extern int fprintf(FILE @,const char ?, ... inject parg_t)
    __attribute__((format(printf,2,3)))
    ;

  extern int fputc(int, FILE @);

  extern int fputs(const char @, FILE @);

  extern size_t fread(char ? @nozeroterm, size_t, size_t, FILE @);

  extern FILE * freopen(const char *, const char @, FILE @`H);
  extern FILE *`r r_freopen(region_t<`r> r, const char *, const char @, FILE @`r);



  extern datatype ScanfArg<`r::E> {
    ShortPtr_sa(short @`r);
    UShortPtr_sa(unsigned short @`r);
    IntPtr_sa(int @`r);
    UIntPtr_sa(unsigned int @`r);
    StringPtr_sa(char ?`r);
    DoublePtr_sa(double @`r);
    FloatPtr_sa(float @`r);
    CharPtr_sa(char ? @nozeroterm`r)
  };



  typedef datatype ScanfArg<`r1> @`r2 sarg_t<`r1,`r2>;


  extern int fscanf(FILE @, const char ?, ... inject sarg_t)
    __attribute__((format(scanf,2,3)))
    ;

  extern int fseek(FILE @, long, int);





  extern int fsetpos(FILE @, const fpos_t @);

  extern long ftell(FILE @);
# 207 "/usr/local/lib/cyclone/cyc-lib/i686-pc-cygwin/include/stdio.h"
  extern size_t fwrite(const char ? @nozeroterm, size_t, size_t, FILE @);

  extern int getc(FILE @);

  extern int getchar(void);
# 225 "/usr/local/lib/cyclone/cyc-lib/i686-pc-cygwin/include/stdio.h"
  extern int pclose(FILE @);


  extern "C" void perror(const char *);

  extern FILE *popen(const char @, const char @);

  extern int printf(const char ?, ... inject parg_t)
    __attribute__((format(printf,1,2)))
    ;

  extern int putc(int, FILE @);

  extern "C" int putchar(int);





  extern "C" int putchar_unlocked(int);

  extern "C" int puts(const char @);

  extern "C" int remove(const char @);

  extern "C" int rename(const char @, const char @);

  extern void rewind(FILE @);


  extern char ?`r rprintf(region_t<`r>, const char ?, ... inject parg_t)
    __attribute__((format(printf,2,3)))
    ;

  extern int scanf(const char ?, ... inject sarg_t)
    __attribute__((format(scanf,1,2)))
    ;


  extern int setvbuf(FILE @, char ? @nozeroterm`H, int, size_t);



  extern void setbuf(FILE @, char ? @nozeroterm`H);

  extern int snprintf(char ? @nozeroterm, size_t, const char ?, ... inject parg_t)
    __attribute__((format(printf,3,4)))
    ;

  extern int sprintf(char ? @nozeroterm, const char ?, ... inject parg_t)
    __attribute__((format(printf,2,3)))
    ;

  extern int sscanf(const char ?, const char ?, ... inject sarg_t)
    __attribute__((format(scanf,2,3)))
    ;
# 290 "/usr/local/lib/cyclone/cyc-lib/i686-pc-cygwin/include/stdio.h"
  extern FILE *tmpfile(void);
# 301 "/usr/local/lib/cyclone/cyc-lib/i686-pc-cygwin/include/stdio.h"
  extern char ? tmpnam(char ?`H);

  extern int ungetc(int, FILE @);

  extern int vfprintf(FILE @, const char ?, parg_t ?)
    __attribute__((format(printf,2,0)))
    ;

  extern int vfscanf(FILE @, const char ?, sarg_t ?)
    __attribute__((format(scanf,2,0)))
    ;

  extern int vprintf(const char ?, parg_t ?)
    __attribute__((format(printf,1,0)))
    ;

  extern char ?`r vrprintf(region_t<`r>, const char ?, parg_t ?)
    __attribute__((format(printf,2,0)))
    ;




  extern int vsnprintf(char ? @nozeroterm, size_t, const char ?, parg_t ?)
    __attribute__((format(printf,3,0)))
    ;

  extern int vsprintf(char ? @nozeroterm, const char ?, parg_t ?)
    __attribute__((format(printf,2,0)))
    ;

  extern int vsscanf(const char ?, const char ?, sarg_t ?)
    __attribute__((format(scanf,2,0)))
    ;


  extern int getw(FILE @);


  extern int putw(int, FILE @);
# 352 "/usr/local/lib/cyclone/cyc-lib/i686-pc-cygwin/include/stdio.h"
  extern datatype exn {
    extern FileOpenError(const char ?);
    extern FileCloseError;
  };
  extern FILE @file_open(const char ?, const char ?);
  extern void file_close(FILE @);






  extern int file_string_read(FILE @, char ?dest, int dest_offset,
                              int max_count);
  extern int file_string_write(FILE @, const char ?src, int src_offset,
                               int max_count);

}
# 2 "hello.cyc" 2

int main() {
    int x = 0;
 printf("buon mercoledì a tutti quanti %d\n",x);

 return 0;

}
