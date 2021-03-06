(function(a) {
    a.fn.leoweather = function(b) {
        var c = {
            city: "",
            format: "{时段}好！ 现在是：{年}/{月}/{日} {时}:{分}:{秒} 星期{周} [{城市}] {昼夜}的天气：{天气} 气温：{气温} 风向：{风向} 风级：{风级} "
        };
        var d = a.extend(c, b);
        return this.each(function() {
            var e = a(this), f = new Array(), h = UC8F6C6362(d.format), i = "http://php.weather.sina.com.cn/iframe/index/w_cl.php?code=js&day=0&city=";
            var j = h.match(/\{.*?\}/g), k = new Array();
            for (var l = 0; j.length > l; l++) {
                k[l] = "UC" + escape(j[l]).replace(/%u/g, "").replace(/%7B/g, "").replace(/%7D/g, "");
            }
            var m = k.toString();
            if (m.indexOf("UC57CE5E02") >= 0 || m.indexOf("UC59296C14") >= 0 || m.indexOf("UC6C146E29") >= 0 || m.indexOf("UC98CE5411") >= 0 || m.indexOf("UC98CE7EA7") >= 0 || m.indexOf("UC57CE5E02") >= 0 || m.indexOf("UC56FE6807") >= 0) {
                a.ajax({
                    url: UC7F515740(i, d.city),
                    dataType: "script",
                    success: function() {
                        for (s in SWther.w) {
                            var o = SWther.w[s][0];
                            f["name"] = s;
                            f["d1"] = o["d1"];
                            f["p1"] = o["p1"];
                            f["s1"] = o["s1"];
                            f["t1"] = o["t1"];
                            f["f1"] = o["f1"];
                            f["d2"] = o["d2"];
                            f["p2"] = o["p2"];
                            f["s2"] = o["s2"];
                            f["t2"] = o["t2"];
                            f["f2"] = o["f2"];
                        }
                        n(f);
                    }
                });
            } else {
                n();
            }
            function n(o) {
                var p = new Date(), q = 0;
    	        for (var r = 0; k.length > r; r++) {
                    str = h.replace(/\{(.*?)\}/g, function(s, t) {
                        var u = "UC" + escape(t).replace(/%u/g, "").replace(/%7B/g, "").replace(/%7D/g, "");
                        return eval(u + "(p,o)");
                    })
                }
                if (k.toString().indexOf("UC65F6") >= 0) {
                    q = 1e3 * 60 * 60;
                }
                if (k.toString().indexOf("UC5206") >= 0) {
                    q = 1e3 * 60;
                }
                if (k.toString().indexOf("UC79D2") >= 0) {
                    q = 1e3;
                }
                e.html(str);
                if (q > 0) {
                    setInterval(UC66F465B0SJ, q);
                }
            }
            function UC66F465B0SJ() {
                var o = new Date();
                YY = o.getYear();
                if (YY < 1900) YY = YY + 1900;
                var p = o.getMonth() + 1;
                if (p < 10) p = "0" + p;
                var q = o.getDate();
                if (q < 10) q = "0" + q;
                var r = o.getHours();
                if (r < 10) r = "0" + r;
                var s = o.getMinutes();
                if (s < 10) s = "0" + s;
                var t = o.getSeconds();
                if (t < 10) t = "0" + t;
                var u = o.getDay();
                if (u == 0) u = UC8F6C6362("日");
                if (u == 1) u = UC8F6C6362("一");
                if (u == 2) u = UC8F6C6362("二");
                if (u == 3) u = UC8F6C6362("三");
                if (u == 4) u = UC8F6C6362("四");
                if (u == 5) u = UC8F6C6362("五");
                if (u == 6) u = UC8F6C6362("六");
                if (r < 6) {
                    xx = UC8F6C6362("凌晨");
                } else if (r < 9) {
                    xx = UC8F6C6362("早上");
                } else if (r < 12) {
                    xx = UC8F6C6362("上午");
                } else if (r < 14) {
                    xx = UC8F6C6362("中午");
                } else if (r < 17) {
                    xx = UC8F6C6362("下午");
                } else if (r < 19) {
                    xx = UC8F6C6362("傍晚");
                } else {
                    xx = UC8F6C6362("晚上");
                }
                a(".weather_YY", e).html(YY);
                a(".weather_MM", e).html(p);
                a(".weather_DD", e).html(q);
                a(".weather_hh", e).html(r);
                a(".weather_mm", e).html(s);
                a(".weather_ss", e).html(t);
                a(".weather_ww", e).html(u);
                a(".weather_xx", e).html(xx);
            }
            function UC5E74(o, p) {
                YY = o.getYear();
                if (YY < 1900) YY = YY + 1900;
                return '<span class="weather_YY">' + YY + "</span>";
            }
            function UC6708(o, p) {
                var q = o.getMonth() + 1;
                if (q < 10) q = "0" + q;
                return '<span class="weather_MM">' + q + "</span>";
            }
            function UC65E5(o, p) {
                var q = o.getDate();
                if (q < 10) q = "0" + q;
                return '<span class="weather_DD">' + q + "</span>";
            }
            function UC65F6(o, p) {
                var q = o.getHours();
                if (q < 10) q = "0" + q;
                return '<span class="weather_hh">' + q + "</span>";
            }
            function UC5206(o, p) {
                var q = o.getMinutes();
                if (q < 10) q = "0" + q;
                return '<span class="weather_mm">' + q + "</span>";
            }
            function UC79D2(o, p) {
                var q = o.getSeconds();
                if (q < 10) q = "0" + q;
                return '<span class="weather_ss">' + q + "</span>";
            }
            function UC5468(o, p) {
                var q = o.getDay();
                if (q == 0) q = UC8F6C6362("日");
                if (q == 1) q = UC8F6C6362("一");
                if (q == 2) q = UC8F6C6362("二");
                if (q == 3) q = UC8F6C6362("三");
                if (q == 4) q = UC8F6C6362("四");
                if (q == 5) q = UC8F6C6362("五");
                if (q == 6) q = UC8F6C6362("六");
                return '<span class="weather_ww">' + q + "</span>";
            }
            function UC65F66BB5(o, p) {
                var q = o.getHours();
                if (q < 6) {
                    xx = UC8F6C6362("凌晨");
                } else if (q < 9) {
                    xx = UC8F6C6362("早上");
                } else if (q < 12) {
                    xx = UC8F6C6362("上午");
                } else if (q < 14) {
                    xx = UC8F6C6362("中午");
                } else if (q < 17) {
                    xx = UC8F6C6362("下午");
                } else if (q < 19) {
                    xx = UC8F6C6362("傍晚");
                } else {
                    xx = UC8F6C6362("晚上");
                }
                return '<span class="weather_xx">' + xx + "</span>";
            }
            function UC57CE5E02(o, p) {
                return p["name"];
            }
            function UC59296C14(o, p) {
                if (o.getHours() > 18 && o.getHours() < 8) {
                    return UC591C95F459296C14(o, p);
                } else {
                    return UC767D592959296C14(o, p);
                }
            }
            function UC767D592959296C14(o, p) {
                return p["s1"];
            }
            function UC591C95F459296C14(o, p) {
                return p["s2"];
            }
            function UC6C146E29(o, p) {
                if (o.getHours() > 18 && o.getHours() < 8) {
                    return UC591C95F46C146E29(o, p);
                } else {
                    return UC767D59296C146E29(o, p);
                }
            }
            function UC767D59296C146E29(o, p) {
                return p["t1"];
            }
            function UC591C95F46C146E29(o, p) {
                return p["t2"];
            }
            function UC98CE5411(o, p) {
                if (o.getHours() > 18 && o.getHours() < 8) {
                    return UC591C95F498CE5411(o, p);
                } else {
                    return UC767D592998CE5411(o, p);
                }
            }
            function UC767D592998CE5411(o, p) {
                return p["d1"];
            }
            function UC591C95F498CE5411(o, p) {
                return p["d2"];
            }
            function UC98CE7EA7(o, p) {
                if (o.getHours() > 18 && o.getHours() < 8) {
                    return UC591C95F498CE7EA7(o, p);
                } else {
                    return UC767D592998CE7EA7(o, p);
                }
            }
            function UC767D592998CE7EA7(o, p) {
                return p["p1"];
            }
            function UC591C95F498CE7EA7(o, p) {
                return p["p2"];
            }
            function UC56FE6807(o, p) {
                if (o.getHours() > 18 && o.getHours() < 8) {
                    return UC591C95F456FE6807(o, p);
                } else {
                    return UC767D592956FE6807(o, p);
                }
            }
            function UC767D592956FE6807(o, p) {
                return p["f1"];
            }
            function UC591C95F456FE6807(o, p) {
                return p["f2"];
            }
            function UC663C591C(o, p) {
                if (o.getHours() > 18 && o.getHours() < 8) {
                    return UC8F6C6362("夜间");
                } else {
                    return UC8F6C6362("白天");
                }
            }
            function UC8F6C6362(o) {
                return unescape(o.replace(/\u/g, "%u"));
            }
            function UC7F515740(o, p) {
                return UC8F6C6362(o) + p + UC8F6C6362("&dfc=1&charset=utf-8").replace(/\%/g, "");
            }
        });
    };
})(jQuery);
