L4T_DEB_COPYRIGHT_MD5 = "fab0c15b4bbf7f8d5ac2bd6673d4211c"

require nvidia-debian-libraries-common.inc

LICENSE += "& Apache-2.0"
LIC_FILES_CHKSUM += "file://usr/share/doc/nvidia-tegra/LICENSE.tegra_sensors;md5=e7fe81c64aaee40b3d9e5b11c3e0ea58"

MAINSUM = "3ce0c2497b979c9c1d684e6395a71d8d9061295e3412eaaa8a2d4a2831ecfd66"
MAINSUM:tegra210 = "0b8adccbbb0b77dd80012116d3c42d4833a616d45652ad6362c50ce5821d57fb"

TEGRA_LIBRARIES_TO_INSTALL = "\
    tegra/libnvcolorutil.so \
    tegra/libnvdc.so \
    tegra/libnvddk_2d_v2.so \
    tegra/libnvddk_vic.so \
    tegra/libnvdla_compiler.so \
    tegra/libnvdla_runtime.so \
    tegra/libnvidia-tls.so.${L4T_VERSION} \
    tegra/libnvimp.so \
    tegra/libnvll.so \
    tegra/libnvos.so \
    tegra/libnvphs.so \
    tegra/libnvrm.so \
    tegra/libnvrm_gpu.so \
    tegra/libnvrm_graphics.so \
    tegra/libsensors.hal-client.nvs.so \
    tegra/libsensors.l4t.no_fusion.nvs.so \
    tegra/libsensors_hal.nvs.so \
    ${SOC_SPECIFIC_LIBS} \
"

SOC_SPECIFIC_LIBS = "\
    tegra/libnvisp_utils.so \
    tegra/libnvpva.so \
"
SOC_SPECIFIC_LIBS:tegra210 = ""

FILES_SOLIBSDEV = ""
SOLIBS = ".so*"
RRECOMMENDS:${PN} = "kernel-module-nvgpu"
RDEPENDS:${PN} = "libc"
RPROVIDES:${PN} += "opencl-icd"

#etc/
#etc/OpenCL/
#etc/OpenCL/vendors/
#etc/OpenCL/vendors/nvidia.icd
#usr/
#usr/lib/
#usr/lib/x86_64-linux-gnu/
#usr/lib/x86_64-linux-gnu/libcuda.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-compiler.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-ml.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-nvvm.so.4.0.0
#usr/lib/x86_64-linux-gnu/libnvidia-opencl.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-ptxjitcompiler.so.510.47.03
#usr/lib/x86_64-linux-gnu/libcuda.so -> libcuda.so.1
#usr/lib/x86_64-linux-gnu/libcuda.so.1 -> libcuda.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-ml.so -> libnvidia-ml.so.1
#usr/lib/x86_64-linux-gnu/libnvidia-ml.so.1 -> libnvidia-ml.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-nvvm.so -> libnvidia-nvvm.so.4
#usr/lib/x86_64-linux-gnu/libnvidia-nvvm.so.4 -> libnvidia-nvvm.so.4.0.0
#usr/lib/x86_64-linux-gnu/libnvidia-opencl.so.1 -> libnvidia-opencl.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-ptxjitcompiler.so -> libnvidia-ptxjitcompiler.so.1
#usr/lib/x86_64-linux-gnu/libnvidia-ptxjitcompiler.so.1 -> libnvidia-ptxjitcompiler.so.510.47.03

