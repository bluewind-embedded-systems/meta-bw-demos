SUMMARY = "Node.js native addon build tool."
SECTION = "js/devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=694e396551033371686c80d3a1a69e88"

PACKAGE_ARCH = "all"

SRC_URI = "https://github.com/nodejs/${PN}/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "ed0706b86395ebbea1f920b061cc8593"
SRC_URI[sha256sum] = "55cd4b64cb338f76deda3d4043f495722040698780bc5eaf28a72717a3c48bfb"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

BBCLASSEXTEND = "native nativesdk"
