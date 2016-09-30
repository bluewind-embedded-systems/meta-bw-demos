SUMMARY = "A binding libnfc to node."
SECTION = "js/devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "all"

SRC_URI = "https://github.com/camme/${PN}/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "285aa4bbb7023267a4081e1d3c99d9fc"
SRC_URI[sha256sum] = "6fa0f8d2d6c93657fb159a958ee5b1554005709c71565ce8e5cadf383c6c2a7d"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

BBCLASSEXTEND = "native nativesdk"

RDEPENDS_${PN} += " libnfc node node-gyp"
