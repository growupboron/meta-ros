# The same as 1.5.0 but with this change undo:
# https://git.openembedded.org/meta-openembedded/commit/?id=476071913bcc18147f39fec8bc613967a4c2fb63

# because meta-ros2-eloquent/generated-recipes/rcl-logging/rcl-logging-spdlog_0.3.3-1.bb
# fails to build with the new version:
# ERROR: rcl-logging-spdlog-0.3.3-1-r0 do_compile: Execution of 'work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/temp/run.do_compile.65729' failed with exit code 1:
# [1/2] work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native/usr/bin/arm-oe-linux-gnueabi/arm-oe-linux-gnueabi-g++  -DRCL_LOGGING_BUILDING_DLL -DROS_PACKAGE_NAME=\"rcl_logging_spdlog\" -DSPDLOG_COMPILED_LIB -Drcl_logging_spdlog_EXPORTS -Iwork/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/git/include -mthumb -mfpu=neon-vfpv4 -mfloat-abi=hard -mcpu=cortex-a7  --sysroot=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot  -O2 -pipe -g -feliminate-unused-debug-types -fmacro-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0=/usr/src/debug/rcl-logging-spdlog/0.3.3-1-r0                      -fdebug-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0=/usr/src/debug/rcl-logging-spdlog/0.3.3-1-r0                      -fdebug-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot=                      -fdebug-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native=  -fvisibility-inlines-hidden  -mthumb -mfpu=neon-vfpv4 -mfloat-abi=hard -mcpu=cortex-a7  --sysroot=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot -fPIC   -Wall -Wextra -Wpedantic -std=gnu++14 -MD -MT CMakeFiles/rcl_logging_spdlog.dir/src/rcl_logging_spdlog.cpp.o -MF CMakeFiles/rcl_logging_spdlog.dir/src/rcl_logging_spdlog.cpp.o.d -o CMakeFiles/rcl_logging_spdlog.dir/src/rcl_logging_spdlog.cpp.o -c work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/git/src/rcl_logging_spdlog.cpp
# [2/2] : && work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native/usr/bin/arm-oe-linux-gnueabi/arm-oe-linux-gnueabi-g++ -fPIC -mthumb -mfpu=neon-vfpv4 -mfloat-abi=hard -mcpu=cortex-a7  --sysroot=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot  -O2 -pipe -g -feliminate-unused-debug-types -fmacro-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0=/usr/src/debug/rcl-logging-spdlog/0.3.3-1-r0                      -fdebug-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0=/usr/src/debug/rcl-logging-spdlog/0.3.3-1-r0                      -fdebug-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot=                      -fdebug-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native=  -fvisibility-inlines-hidden  -mthumb -mfpu=neon-vfpv4 -mfloat-abi=hard -mcpu=cortex-a7  --sysroot=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot  -Wl,-O1 -Wl,--hash-style=gnu -Wl,--as-needed -shared -Wl,-soname,librcl_logging_spdlog.so -o librcl_logging_spdlog.so CMakeFiles/rcl_logging_spdlog.dir/src/rcl_logging_spdlog.cpp.o  work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot/usr/lib/libspdlog.a  work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot/usr/lib/librcutils.so  -lpthread && :
# FAILED: librcl_logging_spdlog.so 
# : && work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native/usr/bin/arm-oe-linux-gnueabi/arm-oe-linux-gnueabi-g++ -fPIC -mthumb -mfpu=neon-vfpv4 -mfloat-abi=hard -mcpu=cortex-a7  --sysroot=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot  -O2 -pipe -g -feliminate-unused-debug-types -fmacro-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0=/usr/src/debug/rcl-logging-spdlog/0.3.3-1-r0                      -fdebug-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0=/usr/src/debug/rcl-logging-spdlog/0.3.3-1-r0                      -fdebug-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot=                      -fdebug-prefix-map=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native=  -fvisibility-inlines-hidden  -mthumb -mfpu=neon-vfpv4 -mfloat-abi=hard -mcpu=cortex-a7  --sysroot=work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot  -Wl,-O1 -Wl,--hash-style=gnu -Wl,--as-needed -shared -Wl,-soname,librcl_logging_spdlog.so -o librcl_logging_spdlog.so CMakeFiles/rcl_logging_spdlog.dir/src/rcl_logging_spdlog.cpp.o  work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot/usr/lib/libspdlog.a  work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot/usr/lib/librcutils.so  -lpthread && :
# work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native/usr/bin/arm-oe-linux-gnueabi/../../libexec/arm-oe-linux-gnueabi/gcc/arm-oe-linux-gnueabi/9.3.0/ld: work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot/usr/lib/libspdlog.a(spdlog.cpp.o): relocation R_ARM_THM_MOVW_ABS_NC against `a local symbol' can not be used when making a shared object; recompile with -fPIC
# work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native/usr/bin/arm-oe-linux-gnueabi/../../libexec/arm-oe-linux-gnueabi/gcc/arm-oe-linux-gnueabi/9.3.0/ld: work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot/usr/lib/libspdlog.a(color_sinks.cpp.o): relocation R_ARM_THM_MOVW_ABS_NC against `_ZZNSt19_Sp_make_shared_tag5_S_tiEvE5__tag' can not be used when making a shared object; recompile with -fPIC
# work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native/usr/bin/arm-oe-linux-gnueabi/../../libexec/arm-oe-linux-gnueabi/gcc/arm-oe-linux-gnueabi/9.3.0/ld: work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot/usr/lib/libspdlog.a(file_sinks.cpp.o): relocation R_ARM_THM_MOVW_ABS_NC against `a local symbol' can not be used when making a shared object; recompile with -fPIC
# work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native/usr/bin/arm-oe-linux-gnueabi/../../libexec/arm-oe-linux-gnueabi/gcc/arm-oe-linux-gnueabi/9.3.0/ld: work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot/usr/lib/libspdlog.a(async.cpp.o): relocation R_ARM_THM_MOVW_ABS_NC against `a local symbol' can not be used when making a shared object; recompile with -fPIC
# work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native/usr/bin/arm-oe-linux-gnueabi/../../libexec/arm-oe-linux-gnueabi/gcc/arm-oe-linux-gnueabi/9.3.0/ld: work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot/usr/lib/libspdlog.a(fmt.cpp.o): relocation R_ARM_THM_MOVW_ABS_NC against `_ZN3fmt2v68internal10basic_dataIvE23zero_or_powers_of_10_32E' can not be used when making a shared object; recompile with -fPIC
# work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot-native/usr/bin/arm-oe-linux-gnueabi/../../libexec/arm-oe-linux-gnueabi/gcc/arm-oe-linux-gnueabi/9.3.0/ld: work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/rcl-logging-spdlog/0.3.3-1-r0/recipe-sysroot/usr/lib/libspdlog.a(spdlog.cpp.o)(.text+0x62): unresolvable R_ARM_THM_MOVW_ABS_NC relocation against symbol `__pthread_key_create@@GLIBC_2.4'
# collect2: error: ld returned 1 exit status

require recipes-support/spdlog/spdlog_1.7.0.bb

SRCREV = "a7148b718ea2fabb8387cb90aee9bf448da63e65"

EXTRA_OECMAKE_remove = "-DSPDLOG_FMT_EXTERNAL=on"